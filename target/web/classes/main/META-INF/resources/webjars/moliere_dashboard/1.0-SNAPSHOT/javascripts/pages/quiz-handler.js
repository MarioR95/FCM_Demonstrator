var score=0;

function checkScore(i, n_quests){
	var trueAnswers = ["1c","2a","3d","4b","5c"];
	$('a[id*="'+i+'"]').click(function(){
		$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
		$(this).addClass('clicked')
		var id= $(this).attr("id");
		$(this).find(".kt-grid-nav__desc").css("color", "#FFFFFF");
		if(id == trueAnswers[i-1]){
			$(this).css("background", "#34bfa3");
			score++;
			//ADD FEEDBACK
		}
		else{
			$(this).css("background", "#fd3995");
			$("#"+trueAnswers[i-1]).css("border","5px solid #34bfa3");
			//ADD FEEDBACK

		}
		
		for(var index=1; index<=n_quests; index++){
			$('a[id*="'+i+'"]').unbind("click");
		}
		
	})
	
	
}

function isAnswered(n_quesiton){
	if($('a[id*="'+n_quesiton+'a"]').hasClass("clicked") || $('a[id*="'+n_quesiton+'b"]').hasClass("clicked")||
			$('a[id*="'+n_quesiton+'c"]').hasClass("clicked") || $('a[id*="'+n_quesiton+'d"]').hasClass("clicked")){
		return true;
	}
}



function getCurrentTime(){
	return Math.floor(Date.now() / 1000);
}