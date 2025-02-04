$("#insertBtn").on("click", () => {
	if (!chkData("#title","책제목을")) return;
	else if (!chkData("#publisher","출판사를")) return;
	else if (!chkData("#year","출간연도를")) return;
	else if (!chkData("#price","책가격을")) return;
	else {
		$("#insertForm").attr("method", "post");
		$("#insertForm").attr("action", "/book/bookInsert");
		$("#insertForm").submit();
	}
});

$("#cancelBtn").on("click", () => {
	$("#insertForm").each(function(){
		this.reset();
	});
});