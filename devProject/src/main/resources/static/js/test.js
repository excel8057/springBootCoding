$("#exam01Btn").on("click", () => {
	$("#exam03Form").attr({
		method:"get",
		action:"/example/exam03"
	});
	$("#exam03Form").submit();
});

$("#exam01Btn").click(function() {
	var name = $("#name").val();
	var age = $("#age").val();
	// Ajax를 통해 서버로 데이터 전송
	$.get("/exam03", { name: name, age: age }, function(data) {
		// 데이터가 성공적으로 반환되면, 화면에 표시
		$("body").html(data);
	});
});

$("#exam02Btn").on("click", () => {
	$("#exam03Form").attr({
		method:"post",
		action:"/example/exam04"
	});
	$("#exam03Form").submit();
});

/*$("#exam04ArrayBtn").on("click", ()=>{
	$("#exam04ArrayForm").attr({
		method:"post",
		action:"/example/exam04Array"
	});
	$("#exam04ArrayForm").submit();
});
*/
$("#exam04BeanBtn").on("click", ()=>{
	$("#exam04BeanForm").attr({
		method:"post",
		action:"/example/exam04Bean"
	});
	$("#exam04BeanForm").submit();
});