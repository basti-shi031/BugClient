import bean.BugInfo;
import bean.response.QueryBugListResponse;
import com.google.gson.Gson;
import network.NetUtils;
import utils.OutUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, String> queryMap = new HashMap<>();
        Map<String, String> updateMap = new HashMap<>();
        queryMap.clear();
        queryMap.put("startId", "1762");
        queryMap.put("category", "base");
        queryMap.put("count", "5");
        while (true) {
            //查询
            String queryResultStr = NetUtils.get(API.QUERY_NOT_CHECKED_BUG, queryMap);
            QueryBugListResponse bugListResponse = new Gson().fromJson(queryResultStr, QueryBugListResponse.class);
            if (bugListResponse.getCode() == 200) {
                List<BugInfo> bugInfoList = bugListResponse.getBugInfoList();
                show(bugInfoList);

                int bugSize = bugInfoList.size();
                for (int index = bugSize - 1; index >= 0; index--) {
                    OutUtils.show("=====", String.valueOf(index), "=====");
                    BugInfo bugInfo = bugInfoList.get(index);
                    Scanner sc = new Scanner(System.in);
                    System.out.println("title:");
                    String title = sc.nextLine();
                    System.out.println("desc:");
                    String desc = sc.nextLine();
                    System.out.println("note:");
                    String note = sc.nextLine();
                    if (note == null || note.length() == 0) {
                        note = "-1";
                    }
                    bugInfo.setTitle(title);
                    bugInfo.setDes(desc);
                    bugInfo.setNote(Integer.parseInt(note));
                    bugInfo.setChecked(1);
                    updateMap.clear();
                    updateMap.put("bug", new Gson().toJson(bugInfo));
                    String resultStr = NetUtils.post(API.UPDATE_BUG, updateMap);
                    OutUtils.show(resultStr);
                }
            }

        }
    }

    private static void show(List<BugInfo> bugInfoList) {
        for (BugInfo bugInfo : bugInfoList) {
            String[] temp = bugInfo.getId().split("~");
            int length = temp.length;
            String url = API.BASEURL + temp[length - 1];
            OutUtils.show(String.valueOf(bugInfo.getUid()), url);
            try {
                Runtime.getRuntime().exec(String.format("cmd   /c   start   %s ", url));
                Thread.sleep(200);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
