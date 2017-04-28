$(document).ready(function() {

	// [로그인]버튼을 클릭하면 자동 실행
	$("#login").click(function() {

		var query = {
			id : $("#id").val(),
			passwd : $("#passwd").val()
		};

		$.ajax({
			type : "POST",
			url : "/shoppingmall/mngr/logon/mLoginPro.do",
			data : query,
			success : function(data) {
				window.location.href = "/shoppingmall/mngr/managerMain.do";
			}

		});
	});

	// [로그아웃]버튼을 클릭하면 자동 실행

	$("#logout").click(function() {
		$.ajax({

			type : "POST",
			url : "/shoppingmall/mngr/logon/mLogout.do",
			success : function(data) {
				window.location.href = "/shoppingmall/mngr/managerMain.do";

			}

		});

	});

});
