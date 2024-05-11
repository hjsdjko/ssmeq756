<template>
<view class="content">
	<view class="box" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>用户名</view>
			<input disabled="true"  style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.yonghuming" placeholder="用户名"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>密码</view>
			<input  type="password" style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>姓名</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
			<view v-if="tableName=='jiashu'" :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group select">
                                <view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">性别</view>
                                <picker  @change="jiashuxingbieChange" :value="jiashuxingbieIndex" :range="jiashuxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"padding":"0 20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" @tap="jiashutouxiangTap" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>头像</view>
			<view style="flex: 1;">
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>手机</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiashu'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>身份证</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>账号</view>
			<input disabled="true"  style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.zhanghao" placeholder="账号"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>密码</view>
			<input  type="password" style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>姓名</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='zhiyuanzhe'" @tap="zhiyuanzhetouxiangTap" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>头像</view>
			<view style="flex: 1;">
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
			<view v-if="tableName=='zhiyuanzhe'" :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group select">
                                <view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">性别</view>
                                <picker  @change="zhiyuanzhexingbieChange" :value="zhiyuanzhexingbieIndex" :range="zhiyuanzhexingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"padding":"0 20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>手机</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='gonganbumen'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>部门账号</view>
			<input disabled="true"  style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.bumenzhanghao" placeholder="部门账号"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='gonganbumen'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>密码</view>
			<input  type="password" style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='gonganbumen'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>负责人</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.fuzeren" placeholder="负责人"></input>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='gonganbumen'" @tap="gonganbumenzhaopianTap" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>照片</view>
			<view style="flex: 1;">
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.zhaopian" mode=""></image>
				<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='gonganbumen'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'>联系电话</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.lianxidianhua" placeholder="联系电话"></input>
		</view>
		
		<view class="btn">
			<button @tap="update()" class="cu-btn lg" :style='{"padding":"0 30rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"20rpx auto","backgroundColor":"rgba(120, 218, 255, 1)","borderColor":"#409EFF","borderRadius":"20rpx 0","color":"#fff","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			<button @tap="logout()" class="cu-btn lg" :style='{"padding":"0 30rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","backgroundColor":"rgba(230, 230, 230, 1)","borderColor":"#E6A23C","borderRadius":"20rpx 0","color":"rgba(174, 174, 174, 1)","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
		</view>
	</view>
</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				jiashuxingbieOptions: [],
				jiashuxingbieIndex: 0,
				zhiyuanzhexingbieOptions: [],
				zhiyuanzhexingbieIndex: 0,
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='jiashu'){
				this.jiashuxingbieOptions = "男,女".split(',');
				this.jiashuxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.jiashuxingbieIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='zhiyuanzhe'){
				this.zhiyuanzhexingbieOptions = "男,女".split(',');
				this.zhiyuanzhexingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.zhiyuanzhexingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        jiashuxingbieChange(e) {
                                this.jiashuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiashuxingbieOptions[this.jiashuxingbieIndex]
                        },
                        // 下拉变化
                        zhiyuanzhexingbieChange(e) {
                                this.zhiyuanzhexingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.zhiyuanzhexingbieOptions[this.zhiyuanzhexingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.yonghuming) && `jiashu` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiashu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `jiashu` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`jiashu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`jiashu` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if((!this.ruleForm.zhanghao) && `zhiyuanzhe` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `zhiyuanzhe` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`zhiyuanzhe` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.bumenzhanghao) && `gonganbumen` == this.tableName){
					this.$utils.msg(`部门账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `gonganbumen` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,jiashutouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,zhiyuanzhetouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,gonganbumenzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	page {
		background-color: #fff;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20220301/fed56a2aa6254b58bd8390f68fde698e.png);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}
	.cu-form-group .title {
		height: auto;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 60rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	}
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}

.picker-select-input {
	line-height: 60rpx;
}
</style>
