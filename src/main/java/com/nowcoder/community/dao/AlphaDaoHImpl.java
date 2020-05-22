package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("AlphaHibernate")
public class AlphaDaoHImpl implements AlpahDao {

    @Override
    public String select() {
        return "hibe";
    }
}
