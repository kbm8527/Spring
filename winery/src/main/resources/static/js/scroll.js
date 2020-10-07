// 스크롤
     $(function(){
     
     
     
     $(function(){
            
            var box = $('.box');

            $(window).scroll(function(){
                
                var t = $(this).scrollTop();

        
                if(t > 330 ){
                    box.css({
                        'position':'fixed',
                         'top':'109px',
                         'width':'300'  
                          
                          
                             
                        })
                  
                }else{
                    box.css({'position':'static'
                    
                    
                    })
                }
            });
        });
  
     });
    


     $(document).ready(function(){

        $('#b_move').click(function(){

    var offset = $('.t_dates').offset(); //선택한 태그의 위치를 반환

        //animate()메서드를 이용해서 선택한 태그의 스크롤 위치를 지정해서 0.6초 동안 부드럽게 해당 위치로 이동함 

    $('html').animate({scrollTop : offset.top}, 600);

    });

    });
