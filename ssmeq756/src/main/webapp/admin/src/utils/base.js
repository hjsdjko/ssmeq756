const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmeq756/",
            name: "ssmeq756",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmeq756/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序的走失人员的报备平台"
        } 
    }
}
export default base
