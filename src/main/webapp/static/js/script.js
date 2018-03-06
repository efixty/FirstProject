var i = 2;

function addQAForm() {
    //
    // var htmlString ="<tr> <td> <form>Your question:<br> <input id='question'" + i + " type='text'><br>Your question:<br> <input id='answer'" + i + " type='text'> </form> </td> </tr>";
    // i++;
    // $(".tableofesiminchvorychiashxati100").append(htmlString);

    var bmdiv = document.createElement('div');
    bmdiv.setAttribute('id', 'myDiv');
    alertMe();
    var str = "<b>aa</b>";
    bmdiv.innerHTML = str;

}

function alertMe() {
    ++i;
    alert(i);
}