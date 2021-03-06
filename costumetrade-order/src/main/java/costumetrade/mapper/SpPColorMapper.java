package costumetrade.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import costumetrade.domain.SpPColor;
import costumetrade.domain.SpPColorKey;
@Mapper
public interface SpPColorMapper {
    int deleteByPrimaryKey(SpPColorKey key);

    int insert(SpPColor record);

    int insertSelective(SpPColor record);

    SpPColor selectByPrimaryKey(SpPColorKey key);

    int updateByPrimaryKeySelective(SpPColor record);

    int updateByPrimaryKey(SpPColor record);
    
    List<SpPColor> getSpPColors(int cropId);
}