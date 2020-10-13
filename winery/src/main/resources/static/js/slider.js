 $(function(){    
  $('.swiper_wrapper').slick({
    slide: 'div',		//슬라이드 되어야 할 태그
    infinite : true, 	//무한 반복 옵션	 
    slidesToShow : 1,		// 한 화면에 보여질 컨텐츠 개수
    slidesToScroll : 1,		//스크롤 한번에 움직일 컨텐츠 개수      	
    arrows : true, 		// 옆으로 이동하는 화살표 표시 여부
    dots : false, 		// 스크롤바 아래 점으로 페이지네이션 여부
    autoplay : false,			// 자동 스크롤 사용 여부
    draggable : true, 	//드래그 가능 여부 

  });
  
});