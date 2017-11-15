# 备忘笔记 - 店小伙

[百度](baidu.com)
***
### 列表页面-通用数据权限设置
```Java
BaseEntity searchBean.dataLimit();// 设置数据权限
// 门店用户
if(StringUtils.isNotEmpty(context.getShopCode())) {
   searchBean.setShopCode(context.getShopCode());
}
// 机构用户（总部用户不做任何处理）
if(StringUtils.isEmpty(searchBean.getOrganCode())){
   searchBean.setOrganCode(context.getOrgCode());
}else if(StringUtils.isNotEmpty(context.getOrgCode() && !searchBean.getOrganCode().equals(context.getOrgCode())) {
   searchBean.setShopCode(searchBean.getOrganCode());
  searchBean.setOrganCode(null);
}
```
***
### 明细页面-回显门店
```Java
// 初始化表单数据
function initData(data) {
  $("form input,select").each(function (index, domEle) {
    ... ...
  });
  $("input[name='organName']").val(.shopName);
  $("#organCode").val(.shopCode);
  ... ...
  $("[name='organName']").val(order['shopView']);
  ... ...
}
```
***
### 列表页面-传递organType
```Java
//高级检索
$(".btn_search").click(function () {
    $(".gjss").css("display", "block");
});
function seniorQuery() {
    //高级搜索先清空普通参数
    $("#queryForm input").val('');
    var data = $("#seniorQueryForm").serializeObject();
    var ndata = $("#queryForm").serializeObject();
    data = $.extend(data, ndata);
    data.organType = data.organSpan_type;
    $("#grid").jqGrid('setGridParam', {
        page: 1,
        postData: data
    }).trigger("reloadGrid");
}
```
***
### shopCode
```Java
<result column="shopCode" property="shopCode" jdbcType="VARCHAR" />
<result column="shopName" property="shopName" jdbcType="VARCHAR" />

concat('[',organCode,']',organName) organView,
concat('[',storeCode,']',storeName) storeView,
concat('[',shopCode,']',shopName) shopView
```
***
### 供应链接口梳理
#### 四：商品等基础信息同步接口
SKU库存查询
供应商库存查询
批次库存查询


#### 五：商品库存同步接口
商品档案
分店商品管理


#### 六：组织机构同步接口
组织机构
分点分仓管理

### 查看服务器日志
```
 cd app
 cd Logs
 cd base.dianxiaohuocy.net
```
查看实时日志命令
```
tail -f base.log
```
退出
> Ctrl + C

查看历史日志命令
```
vi base.log
```
查看第122行
> :122

翻页
> Ctrl + U / Ctrl + D

查看日志信息
> Ctrl + G
