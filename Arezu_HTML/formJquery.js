$(document).ready(function(){
    $("input").focus(function(){
        $(this).css("background-color", "#CFBC99");
    });
    $("input").blur(function(){
        $(this).css("background-color", "#FFEBA8");
    });
});
