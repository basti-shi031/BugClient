package bean;

import java.util.List;

/**
 * Bug信息
 */
public class BugInfo {
    /**
     * _number : 576382
     * owner : {"_account_id":1014443,"name":"Narayan Kamath","email":"narayan@google.com","avatars":[{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg","height":26},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s32-p/photo.jpg","height":32},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s100-p/photo.jpg","height":100}]}
     * submitter : {"_account_id":1014443,"name":"Narayan Kamath","email":"narayan@google.com","avatars":[{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg","height":26},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s32-p/photo.jpg","height":32},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s100-p/photo.jpg","height":100}]}
     * has_review_started : true
     * hashtags : []
     * insertions : 2
     * deletions : 2
     * subject : Track tinyxml2 upgrade.
     * created : 2017-12-22 11:31:48.000000000
     * project : platform/frameworks/av
     * branch : master
     * submitted : 2018-01-05 09:18:16.000000000
     * change_id : Ibe8e8e4b034c7f1d9de1c351943fc1bd3a3af9a7
     * unresolved_comment_count : 0
     * topic : tinyxml2-6.0.0
     * id : platform/frameworks/av~master~Ibe8e8e4b034c7f1d9de1c351943fc1bd3a3af9a7
     * updated : 2018-01-05 09:18:16.000000000
     * status : MERGED
     */
    private int uid;
    private int _number;
    //    private OwnerEntity owner;
//    private SubmitterEntity submitter;
    private boolean has_review_started;
    //    private List<?> hashtags;
    private int insertions;
    private int deletions;
    private String subject;
    private String created;
    private String project;
    private String branch;
    private String submitted;
    private String change_id;
    private int unresolved_comment_count;
    private String topic;
    private String id;
    private String updated;
    private String status;
    private int checked;
    private int note;
    private String title;
    private String des;


    public BugInfo() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void set_number(int _number) {
        this._number = _number;
    }

//    public void setOwner(OwnerEntity owner) {
//        this.owner = owner;
//    }
//
//    public void setSubmitter(SubmitterEntity submitter) {
//        this.submitter = submitter;
//    }

    public void setHas_review_started(boolean has_review_started) {
        this.has_review_started = has_review_started;
    }
//
//    public void setHashtags(List<?> hashtags) {
//        this.hashtags = hashtags;
//    }

    public void setInsertions(int insertions) {
        this.insertions = insertions;
    }

    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public void setChange_id(String change_id) {
        this.change_id = change_id;
    }

    public void setUnresolved_comment_count(int unresolved_comment_count) {
        this.unresolved_comment_count = unresolved_comment_count;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int get_number() {
        return _number;
    }

/*    public OwnerEntity getOwner() {
        return owner;
    }

    public SubmitterEntity getSubmitter() {
        return submitter;
    }*/

    public boolean isHas_review_started() {
        return has_review_started;
    }

//    public List<?> getHashtags() {
//        return hashtags;
//    }

    public int getInsertions() {
        return insertions;
    }

    public int getDeletions() {
        return deletions;
    }

    public String getSubject() {
        return subject;
    }

    public String getCreated() {
        return created;
    }

    public String getProject() {
        return project;
    }

    public String getBranch() {
        return branch;
    }

    public String getSubmitted() {
        return submitted;
    }

    public String getChange_id() {
        return change_id;
    }

    public int getUnresolved_comment_count() {
        return unresolved_comment_count;
    }

    public String getTopic() {
        return topic;
    }

    public String getId() {
        return id;
    }

    public String getUpdated() {
        return updated;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((BugInfo)obj).getId();
    }

    public class OwnerEntity {
        /**
         * _account_id : 1014443
         * name : Narayan Kamath
         * email : narayan@google.com
         * avatars : [{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg","height":26},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s32-p/photo.jpg","height":32},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s100-p/photo.jpg","height":100}]
         */
        private int _account_id;
        private String name;
        private String email;
        private List<AvatarsEntity> avatars;

        public void set_account_id(int _account_id) {
            this._account_id = _account_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAvatars(List<AvatarsEntity> avatars) {
            this.avatars = avatars;
        }

        public int get_account_id() {
            return _account_id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public List<AvatarsEntity> getAvatars() {
            return avatars;
        }

        public class AvatarsEntity {
            /**
             * url : https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg
             * height : 26
             */
            private String url;
            private int height;

            public void setUrl(String url) {
                this.url = url;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public int getHeight() {
                return height;
            }
        }
    }

    public class SubmitterEntity {
        /**
         * _account_id : 1014443
         * name : Narayan Kamath
         * email : narayan@google.com
         * avatars : [{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg","height":26},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s32-p/photo.jpg","height":32},{"url":"https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s100-p/photo.jpg","height":100}]
         */
        private int _account_id;
        private String name;
        private String email;
        private List<AvatarsEntity> avatars;

        public void set_account_id(int _account_id) {
            this._account_id = _account_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAvatars(List<AvatarsEntity> avatars) {
            this.avatars = avatars;
        }

        public int get_account_id() {
            return _account_id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public List<AvatarsEntity> getAvatars() {
            return avatars;
        }

        public class AvatarsEntity {
            /**
             * url : https://lh6.googleusercontent.com/-20Df70S2X6M/AAAAAAAAAAI/AAAAAAAAAAA/_7BewYvGf2Q/s26-p/photo.jpg
             * height : 26
             */
            private String url;
            private int height;

            public void setUrl(String url) {
                this.url = url;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public int getHeight() {
                return height;
            }
        }
    }
}
