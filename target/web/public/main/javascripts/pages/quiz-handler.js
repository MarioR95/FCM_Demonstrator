var score=0;

function initFormQuestions(question, index, contentType){
	//HEADER
	$(".kt-wizard-v3__nav-items").append(
			"<div id='nav_"+index+"' class='kt-wizard-v3__nav-item' data-ktwizard-type='step' data-ktwizard-state='"+((index == 1) ?"current":"pending")+"'>"+
				"<div class='kt-wizard-v3__nav-body'>"+
					"<div class='kt-wizard-v3__nav-label'>"+
					"	<span>"+index+"</span>"+
					"	Question"+
					"</div>"+
					"<div class='kt-wizard-v3__nav-bar'></div>"+
				"</div>"+
			"</div>"
	);
			
	
	//QUESTION
	$("#kt_form").append("<div id='question_"+index+"' class='kt-wizard-v3__content m-0 p-0' data-ktwizard-type='step-content' "+((index == 1) ?"data-ktwizard-state='current'":"")+">"+
						"	<div class='row'>"+
						"	    <div "+((contentType == "assignment")? "class='col-12'" : "class='col-8'")+">"+
						"	        <div class='row-fluid' "+((contentType == "assignment")? "style='width: 100%'": "style='width: 90%'")+">"+
						"           	<!-- question -->"+
					    "        		<div class='kt-section' style='text-align: center;'>"+
						"					<div class='kt-section__content kt-section__content--border kt-section__content--fit'>"+
						"						<div class='kt-portlet__body' style='padding: 2%'>"+
						"							<h5>"+((question.question.indexOf("img") != -1)? question.question : katex.renderToString(question.question))+"</h5>"+
						"						</div>"+
						"					</div>"+
						"				</div>"+					 						            						
						"	        </div>"+
						"	        <div class='row-fluid' "+((contentType == "assignment")? "style='width: 100%'": "style='width: 90%'")+">"+
          				"					<div class='kt-portlet__body'>"+
						"					<!--begin::Section-->"+
						"					<div class='kt-section'>"+
						"						<div class='kt-section__content kt-section__content--border kt-section__content--fit'>"+
						"							<!--begin: Grid Nav -->"+
						"							<div class='kt-grid-nav kt-grid-nav--skin-light'>"+
						"								<div class='kt-grid-nav__row'>"+
						"									<a href='javascript:void(0);'  id= '"+index+"a' class='kt-grid-nav__item'>"+
						"										<span class='kt-grid-nav__icon'>"+
						"										</span>"+
						"										<span class='kt-grid-nav__title' style='display: inline-block; float: left; padding-left: 2%'>a. </span>"+
						"										<span class='kt-grid-nav__desc'>"+((question.answer1.indexOf("img") != -1)? question.answer1 : katex.renderToString(question.answer1))+"</span>"+
						"									</a>"+
						"									<a href='javascript:void(0);'  id= '"+index+"b' class='kt-grid-nav__item'>"+
						"										<span class='kt-grid-nav__icon'>"+
						"										</span>"+
						"										<span class='kt-grid-nav__title' style='display: inline-block; float: left; padding-left: 2%'>b. </span>"+
						"										<span class='kt-grid-nav__desc'>"+((question.answer2.indexOf("img") != -1)? question.answer2 : katex.renderToString(question.answer2))+"</span>"+
						"									</a>"+
						"								</div>"+
						"								<div class='kt-grid-nav__row'>"+
						"								<a href='javascript:void(0);'  id='"+index+"c' class='kt-grid-nav__item'>"+
						"										<span class='kt-grid-nav__icon'>"+
						"										</span>"+
						"										<span class='kt-grid-nav__title' style='display: inline-block; float: left; padding-left: 2%'>c. </span>"+
						"										<span class='kt-grid-nav__desc'>"+((question.answer3.indexOf("img")!= -1)? question.answer3 : katex.renderToString(question.answer3))+"</span>"+
						"									</a>"+
						"									<a href='javascript:void(0);'  id='"+index+"d' class='kt-grid-nav__item'>"+
						"										<span class='kt-grid-nav__icon'>"+
						"										</span>"+
						"										<span class='kt-grid-nav__title' style='display: inline-block; float: left; padding-left: 2%'>d. </span>"+
						"										<span class='kt-grid-nav__desc'>"+((question.answer4.indexOf("img") != -1) ? question.answer4 : katex.renderToString(question.answer4))+"</span>"+
						"									</a>"+
						"								</div>"+
						"							</div>"+
						"							<!--end: Grid Nav -->"+
						"						</div>"+
						"					</div>"+
						"					<!--end::Section-->"+						
						"					</div>"+
						"		        </div>"+
						"		    </div>"+
						"    	<div class='col-4 feedback_container'>"+
						"			<div class='kt-section'  style='height: 98%'>"+
						"				<div class='kt-section__content kt-section__content--border kt-section__content--fit' style='height: 94%'>"+
						"					<div class='kt-portlet__body' style='padding: 2%'>"+
						"						<div id='feedback_"+index+"' class='kt-wizard-v3__nav-label p-2'><h5>Feedback</h5><hr></div>"+
						"					</div>"+
						"				</div>"+
						"			</div>"+
						"	    </div>"+		   
						"	</div>"+		
						"</div>");
	
	
}


function appendFormActions(contentType){
	$("#kt_form").append(
			"<!--begin: Form Actions -->"+
			"<div class='kt-form__actions m-2'>"+
				"<button class='btn btn-secondary btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u' data-ktwizard-type='action-prev'>"+
					"Previous"+
				"</button>"+
				((contentType == "quiz")
					? "<button id='submit-btn' type='button' class='btn btn-success btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u' data-ktwizard-type='action-submit' data-toggle='modal' data-target='#kt_modal_1'>"
					: "<button id='submit-btn' type='button' class='btn btn-success btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u' data-ktwizard-type='action-submit'>"
				)
					+"Submit"+
				"</button>"+ 
				"<button class='btn btn-brand btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u' data-ktwizard-type='action-next'>"+
					"Next Step"+
				"</button>"+
			"</div>"+
			"<!--end: Form Actions -->"
	);
}



function checkQuizScore(i, n_quests, rightAnswer, answersFeedback){
	$('a[id*="'+i+'"]').click(function(){
		$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
		$(this).addClass('clicked')
		var id= $(this).attr("id").split(""+i)[1];
		$(this).find(".kt-grid-nav__desc").css("color", "#FFFFFF");
		if(id == rightAnswer){
			$(this).css("background", "#34bfa3");
			score++;
			//ADD FEEDBACK
			$("#feedback_"+i).append("<p class='text-justify'>"+katex.renderToString(answersFeedback[id])+"</p>")
			
		}
		else{
			$(this).css("background", "#fd3995");
			$("#"+i+""+rightAnswer).css("border","5px solid #34bfa3");
			//ADD FEEDBACK
			$("#feedback_"+i).append("<p class='text-justify'>"+katex.renderToString(answersFeedback[id])+"</p>")

		}
		
		for(var index=1; index<=n_quests; index++){
			$('a[id*="'+i+'"]').unbind("click");
		}
		
	})
	
}

function checkAssignmentScore(i, n_quests, rightAnswer){
	$('a[id*="'+i+'"]').click(function(){
		$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
		$(this).addClass('clicked')
		var id= $(this).attr("id").split(""+i)[1];
		$(this).find(".kt-grid-nav__desc").css("color", "#FFFFFF");
		if(id == rightAnswer){
			$(this).css("background", "#34bfa3");
			score++;	
		}
		else{
			$(this).css("background", "#fd3995");
			$("#"+i+""+rightAnswer).css("border","5px solid #34bfa3");
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


function getResult(){
	return  score;
}


function getCurrentTime(){
	return Math.floor(Date.now() / 1000);
}

function shuffle(arra1) {
    var ctr = arra1.length, temp, index;
// While there are elements in the array
    while (ctr > 0) {
// Pick a random index
        index = Math.floor(Math.random() * ctr);
// Decrease ctr by 1
        ctr--;
// And swap the last element with it
        temp = arra1[ctr];
        arra1[ctr] = arra1[index];
        arra1[index] = temp;
    }
    return arra1;
}

