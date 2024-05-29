

// 수정 이벤트 등록 함수
export function modifyReplyClickEvent() {
  document.getElementById('replyData').addEventListener('click', e => {
    e.preventDefault();
    
    if (!e.target.matches('#replyModBtn')) return;

    console.log('수정 모드 진입');
  });
}


// 플레이스홀더 벨류 변경 함수
export function modContentFix() {
  document.getElementById('replyData').addEventListener('click', e => {
    
    e.preventDefault();
    if (!e.target.matches('#replyModBtn')) return;
    const replyContent = e.target.closest('.row').querySelector('.col-md-9');
    // console.log(replyContent);

    const textarea = document.getElementById('modReplyText');
    textarea.value = replyContent.textContent;
    
  })
};
