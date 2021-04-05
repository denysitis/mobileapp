/*Меню*/
document.querySelector('.menu_btn').addEventListener('click', () => {
  document.querySelector('.menu_btn').classList.toggle('menu_btn_open');
  document.querySelector('.menu-list').classList.toggle('menu-list_open');
  document.querySelector('body').classList.toggle('body_hidden');
});

/*Прелодер*/
window.onload = function() {
	document.body.classList.add('body_hidden');
	window.setTimeout(function () {
		let preloader = document.getElementById('preloader');
		preloader.style.display = 'none';
		document.body.classList.remove('body_hidden');
	},2000);
}
