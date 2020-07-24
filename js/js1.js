var flag = true;

/**
 * [show_menu 鼠标单击“内容分类”展开菜单]
 * css鼠标悬停实现展开菜单要简单许多
 */
function show_menu() {
	var menu1 = document.getElementById("menu1");
	if (flag) {
		menu1.style.display = "block";
		flag = false;
	}else {
		menu1.style.display = "none";
		flag = true;
	}
	
}
/**
 * [close_menu 鼠标离开菜单区域折叠菜单]
 */
function close_menu(){
	var menu1 = document.getElementById("menu1");
	menu1.style.display = "none";
	flag = true;//折叠菜单后flag重置为true,实现再次单击菜单一次即可展开菜单否则离开后需单击两次。

}