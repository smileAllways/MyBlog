package com.blog.studysomething.board.service;

import java.util.List;

public interface BoardService {
	void insertBoard(BoardVO vo) throws Exception;
	void updateBoard(BoardVO vo) throws Exception;
	void deleteboard(BoardVO vo) throws Exception;
	
	
	/**
	 * 글 상세 조회
	 * @param vo
	 * @return
	 */
	BoardVO getBoard(BoardVO vo) throws Exception;
	
	
	/**
	 * 글 목록 조회
	 * @param vo
	 * @return
	 */
	List<BoardVO> getBoardList(BoardVO vo) throws Exception;
}
