const base = {
    get() {
        return {
            url : "http://localhost:8080/chongwushangchengwangzhan/",
            name: "chongwushangchengwangzhan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/chongwushangchengwangzhan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物商城网站"
        } 
    }
}
export default base
