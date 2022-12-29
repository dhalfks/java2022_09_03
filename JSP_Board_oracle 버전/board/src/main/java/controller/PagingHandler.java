package controller;

import domain.PagingVO;

public class PagingHandler {

	private int startPage; // 현재 화면에서 보여줄 시작 페이지네이션 번호
	private int endPage; // 현재 화면에서 보여줄 마지막 페이지네이션 번호
	private boolean prev, next; // 이전, 다음 존재 여부
	
	private int totalCount; // 총 글 수
	private PagingVO pgvo; // 사용자가 입력하는 페이징, 검색 관련 정보 값 객체
	
	public PagingHandler(PagingVO pgvo, int totalCount) {
		this.pgvo = pgvo;
		this.totalCount = totalCount;
		//페이지번호/한화면개시글수 * 한화면 개시글수 (형변환 때문에 *1.0)
		this.endPage 
		= (int)(Math.ceil(pgvo.getPageNo() / (pgvo.getQty()*1.0)))*pgvo.getQty(); 
		this.startPage = this.endPage - 9;
		int realEndPage = (int)(Math.ceil(totalCount*1.0)/pgvo.getQty());
		if(realEndPage < this.endPage) {
			this.endPage = realEndPage;
		}
		this.prev = this.startPage > 1; //존재 여부
		this.next = this.endPage<realEndPage; 
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public PagingVO getPgvo() {
		return pgvo;
	}

	public void setPgvo(PagingVO pgvo) {
		this.pgvo = pgvo;
	}
	
	
}
