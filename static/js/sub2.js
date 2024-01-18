function change(inner){
    var spe = inner.innerHTML;
    var colors = document.getElementsByClassName('main_detail_left_list')

    for(var i = 0; i< colors.length; i++){
        colors[i].style.fontWeight=500;
        colors[i].style.color='gray';
    };
    inner.style.fontWeight=800;
    inner.style.color='black';

    var targetList = ["육군","공군","해군/해병대","기타"];
    for(var i = 0; i < targetList.length; i++){
        var rm = document.getElementsByClassName(targetList[i])
        rm[0].style.display='none';
    }
    var target = document.getElementsByClassName(spe);
    var colors = document.getElementsByClassName('main_detail_right_head_list')

    target[0].style.display='block';
    var reset = document.getElementsByClassName('main_detail_right_detail')
    if(spe = "육군"){
        for(var i = 0; i <reset.length; i++){
            reset[i].style.display='none';
        }
        for(var i = 0; i< colors.length; i++){
            colors[i].style.background='none';
        }
        document.getElementsByClassName('K9자주포')[0].style.display='flex'
    }
    if(spe = "공군"){
        // for(var i = 0; i <reset.length; i++){
        //     reset[i].style.display='none';
        // }
        // for(var i = 0; i< colors.length; i++){
        //     colors[i].style.background='none';
        // }
        document.getElementsByClassName('F-35A')[0].style.display='flex'
    }
    if(spe = "해군/해병대"){
        document.getElementsByClassName('DDG')[0].style.display='flex'
    }
    if(spe = "기타"){
        document.getElementsByClassName('개인화기')[0].style.display='flex'
    }

};

function change2(inner){
    var colors = document.getElementsByClassName('main_detail_right_head_list')
    var spe = inner.innerHTML;

    for(var i = 0; i< colors.length; i++){
        colors[i].style.fontWeight='500';
        colors[i].style.color='gray';
    };
    inner.style.fontWeight=800;
    inner.style.color='black';


    var targets = document.getElementsByClassName('main_detail_right_detail')
    for(var i = 0; i < targets.length; i++){

        targets[i].style.display='none';
    } 
    var target = document.getElementsByClassName(spe);
    
    target[0].style.display='flex';
};
window.onload=function(){
    var scrollMove = document.querySelector('.arrows');
    var left = document.querySelector('.arrow-left');
    var right = document.querySelector('.arrow-right');
    var scrollInterval;

    console.log(left)

    right.addEventListener('mousedown',function(){
        scrollInterval = setInterval(function(){
            scrollMove.scrollLeft += 8;
        }, 10);
    });
    right.addEventListener('mouseup',function(){
        clearInterval(scrollInterval);
    });

    left.addEventListener('mousedown',function(){
        scrollInterval = setInterval(function(){
            scrollMove.scrollLeft -= 8;
        }, 10);
    });
    left.addEventListener('mouseup',function(){
        clearInterval(scrollInterval);
    });

    [right, left].forEach(function(arrow) {
        arrow.addEventListener('mouseleave', function() {
            clearInterval(scrollInterval);
        });
    });
};