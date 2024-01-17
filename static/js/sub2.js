function change(inner){
    var spe = inner.innerHTML
    console.log(inner.getElementsByClassName)
    var targetList = ["육군","공군","해군/해병대","기타"];
    for(var i = 0; i < targetList.length; i++){
        var rm = document.getElementsByClassName(targetList[i])
        rm[0].style.display='none';
    }
    var target = document.getElementsByClassName(spe);
    target[0].style.display='block';

};