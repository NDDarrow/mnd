$(function() {
    $('.slideImg li').last().prependTo('.slideImg');
    $('.slideImg').css('left', -1920);

    setInterval(function() {
        $('.slideImg').animate({left:'-='+1920}, 'slow', function() {
            $('.slideImg li').first().appendTo('.slideImg');
            $('.slideImg').css('left', -1920);
        });
    }, 5000);
});