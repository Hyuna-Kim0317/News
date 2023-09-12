package org.sp.news.model;

import java.util.List;

import org.sp.news.domain.News;

public interface NewsDAO {
	public List selectAll();
	public News select(int news_idx);
	public void insert(News news);
	public void upadte(News news);
	public void delete(int news_idx);
}
