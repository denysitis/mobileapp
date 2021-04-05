function myFunctionSearch() {
	var input, filter, ul, li, a;
	input = document.getElementById('serch-input');
	filter = input.value.toUpperCase();
	ul = document.getElementById('search-ul');
	li = ul.getElementsByTagName('li');

	for (var i = 0; i<li.length; i++) {
		a = li[i].getElementsByTagName("a")[0];
		if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
			li[i].style.display = "";
		}
		else {
			li[i].style.display = "none";
		}
	}
}
/*Випадаючий список меню*/
document.querySelector('.serch_input').addEventListener('click', () => { 
	document.querySelector('.search_div').classList.toggle('open_search_list');
});