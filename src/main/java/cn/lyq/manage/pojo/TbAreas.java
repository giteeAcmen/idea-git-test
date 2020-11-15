package cn.lyq.manage.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TbAreas
 * @Date 2020/11/15 0015 10:48
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbAreas {

    private String id;

    private String areaId;

    private String area;

    private String cityId;
}
