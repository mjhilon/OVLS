package cn.xdl.ovls.video.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.video.dao.ChapterMapper;
import cn.xdl.ovls.video.dao.VideoMapper;
import cn.xdl.ovls.video.entity.Chapter;
import cn.xdl.ovls.video.entity.Video;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private ChapterMapper chapterDao;
	@Autowired
	private VideoMapper videoDao;
	
	
	public List<Chapter> loadCourseVideos(int courseId) {
		//���ݿγ�ID��ѯ�½�
		List<Chapter> chapters = chapterDao.selectByCourseId(courseId);
		return chapters;
	}


	public Video loadVideo(int videoId) {
		Video video = videoDao.selectByPrimaryKey(videoId);
		return video;
	}

}
