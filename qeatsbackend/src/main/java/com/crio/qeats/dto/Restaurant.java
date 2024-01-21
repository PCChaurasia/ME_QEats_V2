
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;


// TODO: CRIO_TASK_MODULE_SERIALIZATION
//  Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
//  "restaurantId": "10",
//  "name": "A2B",
//  "city": "Hsr Layout",
//  "imageUrl": "www.google.com",
//  "latitude": 20.027,
//  "longitude": 30.0,
//  "opensAt": "18:00",
//  "closesAt": "23:00",
//  "attributes": [
//    "Tamil",
//    "South Indian"
//  ]
// }

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
//@JsonIgnoreProperties
public class Restaurant {

    public Restaurant() {}

    @JsonProperty("restaurantId")
    private String restaurantId;

    private String name;
    private String city;
    private String imageUrl;
    private double latitude;
    private double longitude;

    @JsonFormat(pattern = "HH:mm")
    private String opensAt;

    @JsonFormat(pattern = "HH:mm")
    private String closesAt;

    private List<String> attributes;
}


