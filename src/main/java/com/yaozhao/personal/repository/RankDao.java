package com.yaozhao.personal.repository;

import com.yaozhao.personal.model.Ranks;

public interface RankDao {
    boolean save(Ranks r);
    int delete(long id);
    int update(Ranks r);
    Ranks getRanks(int rank);
}
