$(function() {
	$("#update23").click(function() {// [수정]버튼 클릭
		var qna_id = $("#qna_id").val();
		var query = {
			qna_content : $("#uRContent").val(),
			qna_id : $("#qna_id").val()
		};

		$.ajax({
			type : "post",
			url : "/shoppingmall/mg/qnaReplyUpdatePro.do",
			data : query,
			success : function(data) {
				window.location.href = "/shoppingmall/mg/qnaList.do";
			}
		});
	});

	$("#cancle23").click(function() {// [취소] 버튼 클릭
		window.location.href = "/shoppingmall/mg/qnaList.do";
	});
});