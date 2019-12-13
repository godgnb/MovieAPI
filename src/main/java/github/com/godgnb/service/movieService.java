package github.com.godgnb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import github.com.godgnb.domain.MovieCommentVO;
import github.com.godgnb.domain.MovieRequestVO;
import github.com.godgnb.domain.MovieVO;

@Service
public interface movieService {
	
	
    public List<MovieVO> searchMovie(MovieRequestVO vo); // searchMovie
    
    public void searchData(String query);
    
    public List<MovieCommentVO> getComments(String title);
    
    public MovieCommentVO getComment(int num);
    
    public void insertComment(MovieCommentVO vo);
    
    public void deleteComment(int num);
    
    public void updateComment(MovieCommentVO vo);
    
} // movieService interface