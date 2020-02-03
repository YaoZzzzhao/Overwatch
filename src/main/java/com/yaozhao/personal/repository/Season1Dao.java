package com.yaozhao.personal.repository;

import com.yaozhao.personal.model.Season1;
import com.yaozhao.personal.model.View;

public interface Season1Dao {
    boolean save(Season1 s);
    int update(Season1 s);
    int delete(long id);
    Season1 getSeason1(long id);
}
