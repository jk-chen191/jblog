<%- include header %>
<div class="span3"></div>
<div class="span4 ">

    <div class="j-login-header"><h3>登陆框</h3></div>

    <form class="form-horizontal j-login" method="post">

        <div class="control-group">
            <label class="control-label" for="inputEmail">用户名</label>
            <div class="controls">
                <input id="inputEmail" name="name" type="text" />
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">密码</label>
            <div class="controls">
                <input id="inputPassword" name="password" type="password" />
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button type="submit" class="btn">登陆</button>
            </div>

    </form>
</div>

<%- include footer %>