<%@include file="template/header.jsp"%>



	<div id="fullscreen_bg" class="fullscreen_bg"/>
<div id="regContainer" class="container">
      <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <div class="panel panel-login">
          <div class="panel-heading">
            <div class="row">
              <div class="col-xs-6">
                <a href="#" class="active" id="login-form-link">Login</a>
              </div>
              <div class="col-xs-6">
                <a href="#" id="register-form-link">Register</a>
              </div>
            </div>
            <hr>
          </div>
          <div class="panel-body">
            <div class="row">
              <div class="col-lg-12">
                <form id="login-form" action="#" method="post" role="form" style="display: block;">
                  <div class="form-group">
                    <label for="username">Username/Email</label>
                    <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username/Email" value="">
                  </div>
                  <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                  </div>
                  <div class="form-group text-center">
                    <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                    <label for="remember"> Remember Me</label>
                  </div>
                  <div class="form-group">
                    <div class="row">
                      <div class="col-sm-6 col-sm-offset-3">
                        <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-success" value="Log In">
                      </div>
                    </div>
                  </div>
                </form>
                <form id="register-form" action="#" method="post" role="form" style="display: none;">
                  <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                  </div>
                  <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" name="email" id="confirm-password" tabindex="2" class="form-control" placeholder="Email">
                  </div>
                    <div class="form-group">
                    <label for="email">Ime</label>
                    <input type="text" name="ime" id="confirm-password" tabindex="2" class="form-control" placeholder="Ime">
                  </div>
                    <div class="form-group">
                    <label for="email">Prezime</label>
                    <input type="text" name="prezime" id="confirm-password" tabindex="2" class="form-control" placeholder="Prezime">
                  </div>
                    <div class="form-group">
                    <label for="email">Telefon</label>
                    <input type="text" name="telefon" id="confirm-password" tabindex="2" class="form-control" placeholder="Telefon">
                  </div>
                    <div class="form-group">
                    <label for="email">Adresa</label>
                    <input type="text" name="adresa" id="confirm-password" tabindex="2" class="form-control" placeholder="Adresa">
                  </div>
                  <div class="form-group">
                    <div class="row">
                      <div class="col-sm-6 col-sm-offset-3">
                        <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-success" value="Register Now">
                      </div>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
	<script type="text/javascript">
	$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});
	</script>

<%@include file="template/footer.jsp"%>
