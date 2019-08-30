$(document).ready(function(){
    $("input[name=nom]").focus(function(){
        $(this).css("background-color", "#FFEBA8");
    });
  
   $("input[name=nom]").blur(function(){
        $(this).css("background-color", "#CFBC95");
    });
  
  $("input[name=pass]").focus(function(){
        $(this).css("background-color", "#FFEBA8");
    });
  
    $("input[name=pass]").blur(function(){
        $(this).css("background-color", "#BCBC80");
    });
});
