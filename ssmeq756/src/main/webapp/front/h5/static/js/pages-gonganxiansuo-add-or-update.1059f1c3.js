(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-gonganxiansuo-add-or-update"],{"061f":function(r,e,i){"use strict";i.r(e);var t=i("e148"),a=i("cf53");for(var n in a)"default"!==n&&function(r){i.d(e,r,(function(){return a[r]}))}(n);i("b236");var o,u=i("f0c5"),d=Object(u["a"])(a["default"],t["b"],t["c"],!1,null,"4444f173",null,!1,t["a"],o);e["default"]=d.exports},"3b42":function(r,e,i){var t=i("f200");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var a=i("4f06").default;a("f7fc6a94",t,!0,{sourceMap:!1,shadowMode:!1})},"68d9":function(r,e,i){"use strict";var t=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("a481"),i("c5f6"),i("f559"),i("ac6a"),i("96cf");var a=t(i("3b8d")),n=t(i("e2b1")),o={data:function(){return{cross:"",ruleForm:{xiansuomingcheng:"",xiansuotupian:"",xiansuoneirong:"",faburiqi:"",yonghuming:"",bumenzhanghao:"",lianxidianhua:"",userid:""},user:{},ro:{xiansuomingcheng:!1,xiansuotupian:!1,xiansuoneirong:!1,faburiqi:!1,yonghuming:!1,bumenzhanghao:!1,lianxidianhua:!1,userid:!1}}},components:{wPicker:n.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(e){var i,t,a,n;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.ruleForm.faburiqi=this.$utils.getCurDate(),i=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(i);case 4:if(t=r.sent,this.user=t.data,this.ruleForm.bumenzhanghao=this.user.bumenzhanghao,this.ro.bumenzhanghao=!0,this.ruleForm.lianxidianhua=this.user.lianxidianhua,this.ro.lianxidianhua=!0,this.ro.yonghuming=!0,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){r.next=19;break}return this.ruleForm.id=e.id,r.next=17,this.$api.info("gonganxiansuo",this.ruleForm.id);case 17:t=r.sent,this.ruleForm=t.data;case 19:if(this.cross=e.cross,!e.cross){r.next=59;break}a=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(a);case 23:if((r.t1=r.t0()).done){r.next=59;break}if(n=r.t1.value,"xiansuomingcheng"!=n){r.next=29;break}return this.ruleForm.xiansuomingcheng=a[n],this.ro.xiansuomingcheng=!0,r.abrupt("continue",23);case 29:if("xiansuotupian"!=n){r.next=33;break}return this.ruleForm.xiansuotupian=a[n],this.ro.xiansuotupian=!0,r.abrupt("continue",23);case 33:if("xiansuoneirong"!=n){r.next=37;break}return this.ruleForm.xiansuoneirong=a[n],this.ro.xiansuoneirong=!0,r.abrupt("continue",23);case 37:if("faburiqi"!=n){r.next=41;break}return this.ruleForm.faburiqi=a[n],this.ro.faburiqi=!0,r.abrupt("continue",23);case 41:if("yonghuming"!=n){r.next=45;break}return this.ruleForm.yonghuming=a[n],this.ro.yonghuming=!0,r.abrupt("continue",23);case 45:if("bumenzhanghao"!=n){r.next=49;break}return this.ruleForm.bumenzhanghao=a[n],this.ro.bumenzhanghao=!0,r.abrupt("continue",23);case 49:if("lianxidianhua"!=n){r.next=53;break}return this.ruleForm.lianxidianhua=a[n],this.ro.lianxidianhua=!0,r.abrupt("continue",23);case 53:if("userid"!=n){r.next=57;break}return this.ruleForm.userid=a[n],this.ro.userid=!0,r.abrupt("continue",23);case 57:r.next=23;break;case 59:this.styleChange();case 60:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},faburiqiChange:function(r){this.ruleForm.faburiqi=r.target.value,this.$forceUpdate()},xiansuotupianTap:function(){var r=this;this.$api.upload((function(e){r.ruleForm.xiansuotupian="upload/"+e.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(){var e,i,t,a,n,o,u,d,s,l;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.cross){r.next=16;break}if(a=uni.getStorageSync("statusColumnName"),n=uni.getStorageSync("statusColumnValue"),""==a){r.next=16;break}if(o=uni.getStorageSync("crossObj"),a.startsWith("[")){r.next=12;break}for(u in o)u==a&&(o[u]=n);return d=uni.getStorageSync("crossTable"),r.next=10,this.$api.update("".concat(d),o);case 10:r.next=16;break;case 12:e=Number(uni.getStorageSync("userid")),i=o["id"],t=uni.getStorageSync("statusColumnName"),t=t.replace(/\[/,"").replace(/\]/,"");case 16:if(!i||!e){r.next=38;break}return this.ruleForm.crossuserid=e,this.ruleForm.crossrefid=i,s={page:1,limit:10,crossuserid:e,crossrefid:i},r.next=22,this.$api.list("gonganxiansuo",s);case 22:if(l=r.sent,!(l.data.total>=t)){r.next=28;break}return this.$utils.msg(uni.getStorageSync("tips")),r.abrupt("return",!1);case 28:if(!this.ruleForm.id){r.next=33;break}return r.next=31,this.$api.update("gonganxiansuo",this.ruleForm);case 31:r.next=35;break;case 33:return r.next=35,this.$api.add("gonganxiansuo",this.ruleForm);case 35:this.$utils.msgBack("提交成功");case 36:r.next=46;break;case 38:if(!this.ruleForm.id){r.next=43;break}return r.next=41,this.$api.update("gonganxiansuo",this.ruleForm);case 41:r.next=45;break;case 43:return r.next=45,this.$api.add("gonganxiansuo",this.ruleForm);case 45:this.$utils.msgBack("提交成功");case 46:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,a=e.getDate();return"start"===r?i-=60:"end"===r&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(r){this.$refs[r].show()}}};e.default=o},b236:function(r,e,i){"use strict";var t=i("3b42"),a=i.n(t);a.a},cf53:function(r,e,i){"use strict";i.r(e);var t=i("68d9"),a=i.n(t);for(var n in t)"default"!==n&&function(r){i.d(e,r,(function(){return t[r]}))}(n);e["default"]=a.a},e148:function(r,e,i){"use strict";var t,a=function(){var r=this,e=r.$createElement,i=r._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-form",{staticClass:"app-update-pv"},[i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("线索名称")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.xiansuomingcheng,placeholder:"线索名称"},model:{value:r.ruleForm.xiansuomingcheng,callback:function(e){r.$set(r.ruleForm,"xiansuomingcheng",e)},expression:"ruleForm.xiansuomingcheng"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.xiansuotupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("线索图片")]),i("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[r.ruleForm.xiansuotupian?i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:r.baseUrl+r.ruleForm.xiansuotupian,mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),i("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("发布日期")]),i("v-uni-picker",{attrs:{mode:"date",value:r.ruleForm.faburiqi},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.faburiqiChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"rgba(31, 165, 216, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",lineHeight:"60rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.faburiqi?r.ruleForm.faburiqi:"请选择发布日期"))])],1)],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("用户名")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.yonghuming,placeholder:"用户名"},model:{value:r.ruleForm.yonghuming,callback:function(e){r.$set(r.ruleForm,"yonghuming",e)},expression:"ruleForm.yonghuming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("部门账号")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.bumenzhanghao,placeholder:"部门账号"},model:{value:r.ruleForm.bumenzhanghao,callback:function(e){r.$set(r.ruleForm,"bumenzhanghao",e)},expression:"ruleForm.bumenzhanghao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("联系电话")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.lianxidianhua,placeholder:"联系电话"},model:{value:r.ruleForm.lianxidianhua,callback:function(e){r.$set(r.ruleForm,"lianxidianhua",e)},expression:"ruleForm.lianxidianhua"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"12rpx 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("线索内容")]),i("v-uni-textarea",{style:{padding:"20rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"rgba(31, 165, 216, 1)",borderRadius:"20rpx 0",color:"rgba(0, 0, 0, 1)",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"240rpx"},attrs:{placeholder:"线索内容"},model:{value:r.ruleForm.xiansuoneirong,callback:function(e){r.$set(r.ruleForm,"xiansuoneirong",e)},expression:"ruleForm.xiansuoneirong"}})],1),i("v-uni-view",{staticClass:"btn"},[i("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"20rpx auto",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"#409EFF",borderRadius:"20rpx 0",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},n=[];i.d(e,"b",(function(){return a})),i.d(e,"c",(function(){return n})),i.d(e,"a",(function(){return t}))},f200:function(r,e,i){var t=i("24fb");e=t(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-4444f173]{padding:%?20?%}.content[data-v-4444f173]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220301/d67240b0559f478e8e8f98b806fde837.png);background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-4444f173]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-4444f173]{width:%?180?%}.avator[data-v-4444f173]{width:%?150?%;height:%?60?%}.right-input[data-v-4444f173]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-4444f173]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-4444f173]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-4444f173]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-4444f173]{border:0}.cu-form-group uni-input[data-v-4444f173]{padding:0 %?30?%}.uni-input[data-v-4444f173]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-4444f173]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-4444f173]::after{line-height:%?60?%}.select .uni-input[data-v-4444f173]{line-height:%?60?%}.input .right-input[data-v-4444f173]{line-height:%?60?%}',""]),r.exports=e}}]);