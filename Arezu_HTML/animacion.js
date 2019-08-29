$("document").ready(function(){
  $("header").mouseover(function(){
   $("h1").animate({opacity:"0.5",
   },500);  
    });
    $("header").mouseout(function(){ 
     $("h1").css("color", "orange");
     $("h1").animate({opacity:"1",
     },100);
    });  
      
   $("section").mouseover(function(){
    $("h2").animate({opacity:"0.8",
     },2000);  
   });  
  }); 