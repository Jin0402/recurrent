$(function(){
	let pageUrlParameters = location.search;
	let pageUrlParametersArr = pageUrlParameters.split('?');
	let parameters = pageUrlParametersArr[1];
	console.log(pageUrlParametersArr[1]);
	console.log('-------');

  $('.global-nav li a').each(function(){
	let target = $(this).attr('href');
	let targetArr = target.split('?');
	let targetAllCategory = targetArr[1];
	console.log(targetAllCategory);

    if(targetAllCategory === parameters) {
      $(this).parent().addClass('current');
    } else {
      $(this).parent().removeClass('current');
    }
  });
});