package com.src.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Asus on 2019/1/3.
 */
@Data
public class CollectionVo  implements Serializable{


    private static final long serialVersionUID = -2953122991426159770L;

    @JsonProperty("time")
    private Long collectionTime;

    @JsonProperty("value")
    private Integer collectionValue;

    @JsonProperty
    private List<CollectionVo> da;

}
