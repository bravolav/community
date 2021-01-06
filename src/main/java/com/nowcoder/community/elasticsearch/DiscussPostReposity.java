package com.nowcoder.community.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussPostReposity extends ElasticsearchRepository<DiscussPost, Integer> {


}
