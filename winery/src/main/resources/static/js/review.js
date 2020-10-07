
         $(document).ready(function() {
          // Configure/customize these variables.
          var showChar = 150;  // How many characters are shown by default
          var ellipsestext = "...";
          var moretext = 'Read more';
          var lesstext = "Read less";
          
      
          $('.text').each(function() {
              var text = $(this).html();
       
              if(text.length > showChar) {
       
                  var c = text.substr(0, showChar);
                  var h = text.substr(showChar, text.length - showChar);
       
                  var html = c + '<span class="moreellipses">' + ellipsestext+ '&nbsp;</span><span class="morecontent"><span>' + h + '</span>&nbsp;&nbsp;<a class="moretext" >' + moretext + '</a></span>';
       
                  $(this).html(html);
              }
       
          });
       
          $(".moretext").click(function(){
              if($(this).hasClass("less")) {
                  $(this).removeClass("less");
                  $(this).html(moretext);
              } else {
                  $(this).addClass("less");
                  $(this).html(lesstext);
              }
              $(this).parent().prev().toggle();
              $(this).prev().toggle();
              return false;
          });
      });
             
      

