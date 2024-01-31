<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(229, 238, 229, 0.07);borderRadius:10px">
        <h1 class="h1" style="color:rgba(24, 103, 228, 1);fontSize:28px;">智能物流管理系统注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhanghao" class="input" type="text" placeholder="账号">
			   </div>
			 </div> -->
			<el-form-item label="账号" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.zhanghao" autocomplete="off" placeholder="账号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">顾客姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gukexingming" class="input" type="text" placeholder="顾客姓名">
			   </div>
			 </div> -->
			<el-form-item label="顾客姓名" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.gukexingming" autocomplete="off" placeholder="顾客姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机"  />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱"  />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证"  />
			</el-form-item>
			<!-- <div v-if="tableName=='guke'" class="input-group">
			   <div class="label">地址</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dizhi" class="input" type="text" placeholder="地址">
			   </div>
			 </div> -->
			<el-form-item label="地址" class="input" v-if="tableName=='guke'">
			  <el-input v-model="ruleForm.dizhi" autocomplete="off" placeholder="地址"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gonghao" class="input" type="text" placeholder="工号">
			   </div>
			 </div> -->
			<el-form-item label="工号" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.gonghao" autocomplete="off" placeholder="工号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">员工姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yuangongxingming" class="input" type="text" placeholder="员工姓名">
			   </div>
			 </div> -->
			<el-form-item label="员工姓名" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.yuangongxingming" autocomplete="off" placeholder="员工姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">门店名称</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mendianmingcheng" class="input" type="text" placeholder="门店名称">
			   </div>
			 </div> -->
			<el-form-item label="门店名称" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.mendianmingcheng" autocomplete="off" placeholder="门店名称"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证"  />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">店主账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianzhuzhanghao" class="input" type="text" placeholder="店主账号">
			   </div>
			 </div> -->
			<el-form-item label="店主账号" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.dianzhuzhanghao" autocomplete="off" placeholder="店主账号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">店主姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianzhuxingming" class="input" type="text" placeholder="店主姓名">
			   </div>
			 </div> -->
			<el-form-item label="店主姓名" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.dianzhuxingming" autocomplete="off" placeholder="店主姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">联系电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxidianhua" class="input" type="text" placeholder="联系电话">
			   </div>
			 </div> -->
			<el-form-item label="联系电话" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.lianxidianhua" autocomplete="off" placeholder="联系电话"  />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱"  />
			</el-form-item>
			<!-- <div v-if="tableName=='dianzhu'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='dianzhu'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证"  />
			</el-form-item>
			<div style="display: flex;flex-wrap: wrap;width: 100%;justify-content: center;">
				<el-button class="btn" type="primary" @click="login()">注册</el-button>
				<el-button class="btn close" type="primary" @click="close()">取消</el-button>
			</div>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
      },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    close(){
	this.$router.push({ path: "/login" });
    },
    // 注册
    login() {
      if((!this.ruleForm.zhanghao) && `guke` == this.tableName){
        this.$message.error(`账号不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `guke` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((!this.ruleForm.gukexingming) && `guke` == this.tableName){
        this.$message.error(`顾客姓名不能为空`);
        return
      }
      if(`guke` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if(`guke` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
      if(`guke` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if((!this.ruleForm.gonghao) && `yuangong` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `yuangong` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((!this.ruleForm.yuangongxingming) && `yuangong` == this.tableName){
        this.$message.error(`员工姓名不能为空`);
        return
      }
      if(`yuangong` == this.tableName && this.ruleForm.bumen&&(!this.$validate.isEmail(this.ruleForm.bumen))){
        this.$message.error(`部门应输入邮件格式`);
        return
      }
      if(`yuangong` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if(`yuangong` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if((!this.ruleForm.dianzhuzhanghao) && `dianzhu` == this.tableName){
        this.$message.error(`店主账号不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `dianzhu` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((!this.ruleForm.dianzhuxingming) && `dianzhu` == this.tableName){
        this.$message.error(`店主姓名不能为空`);
        return
      }
      if(`dianzhu` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
      if(`dianzhu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
      if(`dianzhu` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201110/8f9e1d94bb6243aba9de49b67bc3b5a7.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(30, 144, 255, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: rgba(42, 102, 221, 1);
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					margin: 0 10px;
					width: 88px;
					height: 45px;
					color: #fff;
					font-size: 14px;
					border-width: 0px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(24, 144, 255, 1);
				}

				.close {
					margin: 0 10px;
					width: 88px;
					height: 44px;
					color: #409EFF;
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: #FFF;
				}

			}
		}
	}
</style>
