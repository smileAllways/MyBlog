package com.blog.studysomething.board.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.blog.studysomething.board.service.BoardVO;

public class BoardDAO {

	// MyBatis 이용을 위한 변수
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertBoard(BoardVO vo) {
		return sqlSession.insert("insertBoard", vo);
	}
	
	public int updateBoard(BoardVO vo) {
		return sqlSession.update("updateBoard", vo);
	}
	
	public int deleteBoard(BoardVO vo) {
		return sqlSession.delete("deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return sqlSession.selectOne("getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		return sqlSession.selectList("getBoardList", vo);
	}
}
