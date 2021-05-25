var frmElem = document.querySelector('#frm');
var uidElem = frmElem.uid;
var upwElem = frmElem.upw;
var chkUpwElem = frmElem.chkUpw;
var unmElem = frmElem.unm;
var chkUidresult = frmElem.querySelector('#chkUidResult')

var btnChkIdElem = frmElem.btnChkId;

	btnChkIdElem.addEventListener('click', () => {
	idChkAjax(uidElem.value);
});

function idChkAjax(uid)
{
	console.log(uid);
	
	fetch('/user/idChk?uid=' + uid)
	.then(function(res)
	{
		return res.json();
	})
	.then(function(myJson)
	{
		console.log(myJson);
		switch(myJson.result)
		{
			case 0:
			chkUidresult.innerText = '이 아이디는 사용할수있습니다';
			break;
			case 1:
			chkUidresult.innerText = '이 아이디는 사용할수없습니다';
			break;
		}
	});
}

function frmChk()
{
	var uidVal = uidElem.value; //2자 이하면 리턴 false
	if(uidVal.length <= 2)
	{	
		console.log(uidVal);
		if(uidVal.length == 0)
		{
			alert('아이디를 작성해 주세요');
		}
		else
		{
			alert('3자 이상 작성해 주세요');
		}
		return false;
	}

	var upwVal = upwElem.value;
	var chkUpwVal = chkUpwElem.value;
	var unmVal = unmElem.value;
	
	if(upwVal.length <= 3)
	{
		if(upwVal.length == 0)
		{
			console.log('chk!');
			alert('비밀번호를작성해주세요');
		}
		else
		{
			alert('비밀번호는 4자이상');
		}
			return false;
	}
	else if (upwVal != chkUpwVal)
	{
		alert('비밀번호를 확인해주세요');
		return false;
	}	
	
	if(unmVal.length < 2)
	{
		alert('이름은 2자이상')
		return false;
	}
	
}