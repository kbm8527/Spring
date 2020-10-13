	$(function(){
			
			$('input.agree').click(function(){
		
				
				// 체크여부 확인
				//$(function(){
					
					if($('input[name=agree1]').is(':checked') == false){
						alert('동의 하셔야 합니다1.');
						return false;
					}else if($('input[name=agree2]').is(':checked') == false){
						alert('동의 하셔야 합니다2.');
						return false;
					}else if($('input[name=agree3]').is(':checked') == false){
						alert('동의 하셔야 합니다3.');
						return true;
					}else{
						alert('동의');
						
					}
					
			
				});
			});	

