package bean.response;



import bean.BugInfo;

import java.util.List;

/**
 * 查询bug的返回结果
 */
public class QueryBugListResponse extends BaseResponse{
    List<BugInfo> bugInfoList;


    public QueryBugListResponse(int code, String message) {
        super(code, message);
    }

    public QueryBugListResponse(int code, String message, List<BugInfo> bugInfoList) {
        super(code, message);
        this.bugInfoList = bugInfoList;
    }

    public QueryBugListResponse() {
    }

    public List<BugInfo> getBugInfoList() {
        return bugInfoList;
    }

    public void setBugInfoList(List<BugInfo> bugInfoList) {
        this.bugInfoList = bugInfoList;
    }
}
