package dys.bdindoormapdemo.api;

/**
 * Created by dys on 2016/9/8 0008.
 */
public interface NetConstants {
    String HOST = "http://172.16.5.25:9110/";
    String GET_SERVICE_FACILITIES_BY_STATION_ID = "diagram/getServiceFacilitiesByStationId";

    //8a0b908d2e8f46bfb6458c553b0e3b34 郑州东stationId
    String testJson = "{\n" +
            "  \"success\": true,\n" +
            "  \"code\": 0,\n" +
            "  \"message\": \"\",\n" +
            "  \"data\": {\n" +
            "    \"longitude\": 113.78528400937299,\n" +
            "    \"latitude\": 34.76572822445623,\n" +
            "    \"leftTopLongitude\": 0,\n" +
            "    \"leftTopLatitude\": 0,\n" +
            "    \"rightBottomLongitude\": 0,\n" +
            "    \"rightBottomLatitude\": 0,\n" +
            "    \"facilityServices\": [\n" +
            "      {\n" +
            "        \"firstFacilityName\": \"出发到达\",\n" +
            "        \"firstFacilityList\": [\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"06437df8757311e6b7880242ac11000c\",\n" +
            "                \"name\": \"自动取票机\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783068\",\n" +
            "                \"latitude\": \"34.763984\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"2d649113757111e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e8950b02757111e6b7880242ac11000c\",\n" +
            "                \"name\": \"自动取票机\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.782951\",\n" +
            "                \"latitude\": \"34.766119\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"2d649113757111e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"取票\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"283697e7757411e6b7880242ac11000c\",\n" +
            "                \"name\": \"售票室一\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783023\",\n" +
            "                \"latitude\": \"34.765956\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"32f055c6757311e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"a5025406757311e6b7880242ac11000c\",\n" +
            "                \"name\": \"售票室二\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783077\",\n" +
            "                \"latitude\": \"34.764221\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"32f055c6757311e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"购票\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"020ad72f757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B22B23\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784963\",\n" +
            "                \"latitude\": \"34.764785\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"023cf574757a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B17B16\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785718\",\n" +
            "                \"latitude\": \"34.765415\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"096bec02757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A19A18\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785718\",\n" +
            "                \"latitude\": \"34.764718\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"0ce410f8757711e6b7880242ac11000c\",\n" +
            "                \"name\": \"A8A9\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784595\",\n" +
            "                \"latitude\": \"34.765460\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"16e9ddb0757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B24B25\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784631\",\n" +
            "                \"latitude\": \"34.764807\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"1a4578dc757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A20A21\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785925\",\n" +
            "                \"latitude\": \"34.765474\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"1dae4ba3757711e6b7880242ac11000c\",\n" +
            "                \"name\": \"A12A13\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784990\",\n" +
            "                \"latitude\": \"34.765460\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"278308a3757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B26B27\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784388\",\n" +
            "                \"latitude\": \"34.764800\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"3957ab21757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A22A23\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786131\",\n" +
            "                \"latitude\": \"34.765474\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"39bc738d757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B28B29\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784137\",\n" +
            "                \"latitude\": \"34.764807\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"4908be2f757611e6b7880242ac11000c\",\n" +
            "                \"name\": \"A1\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783400\",\n" +
            "                \"latitude\": \"34.765445\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"4bba41ec757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A24A25\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786392\",\n" +
            "                \"latitude\": \"34.765474\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"4eb08f55757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B30B31\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783867\",\n" +
            "                \"latitude\": \"34.765408\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"64125ab3757b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B32\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783427\",\n" +
            "                \"latitude\": \"34.764763\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"6bb270a1757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A26A27\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786634\",\n" +
            "                \"latitude\": \"34.765489\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"6c313714757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B3B2\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787137\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"8223c36f757a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B19B18\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785484\",\n" +
            "                \"latitude\": \"34.764807\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"8437847e757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A28A29\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786886\",\n" +
            "                \"latitude\": \"34.765489\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"8709a8ea757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B4B5\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786940\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"9b6adc5b757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B6B7\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786679\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"aadd2bf2757611e6b7880242ac11000c\",\n" +
            "                \"name\": \"A3A2\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783903\",\n" +
            "                \"latitude\": \"34.765460\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"acec2c75757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B8B9\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786455\",\n" +
            "                \"latitude\": \"34.764815\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"b2f17e62757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A30A31\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787146\",\n" +
            "                \"latitude\": \"34.764740\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c0d222a0757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B12B13\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786158\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c345578f757611e6b7880242ac11000c\",\n" +
            "                \"name\": \"A4A5\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784137\",\n" +
            "                \"latitude\": \"34.765460\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c68270a7757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"A32\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787452\",\n" +
            "                \"latitude\": \"34.764740\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"d81547e8757711e6b7880242ac11000c\",\n" +
            "                \"name\": \"A15A14\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785242\",\n" +
            "                \"latitude\": \"34.764711\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"d9b500f9757611e6b7880242ac11000c\",\n" +
            "                \"name\": \"A6A7\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784397\",\n" +
            "                \"latitude\": \"34.764703\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"dfb389b8757a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B20B21\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785260\",\n" +
            "                \"latitude\": \"34.764807\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e4a07d40757811e6b7880242ac11000c\",\n" +
            "                \"name\": \"B1\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787559\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e99277e6757911e6b7880242ac11000c\",\n" +
            "                \"name\": \"B15B14\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785942\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ed9af17f757711e6b7880242ac11000c\",\n" +
            "                \"name\": \"A17A16\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785475\",\n" +
            "                \"latitude\": \"34.764718\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"5f501fb8757411e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"接人\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"037a34a8758d11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B30-B31\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783921\",\n" +
            "                \"latitude\": \"34.764792\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"0756e225758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B2-B3\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787182\",\n" +
            "                \"latitude\": \"34.764837\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"0fe8838f758d11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B32\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783391\",\n" +
            "                \"latitude\": \"34.765422\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"13b1fbf2758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A8-A9\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784631\",\n" +
            "                \"latitude\": \"34.764703\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"165b49e0758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B4-B5\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786931\",\n" +
            "                \"latitude\": \"34.764785\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"2af4bbdc758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B6-B7\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786679\",\n" +
            "                \"latitude\": \"34.764829\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"2d5cc0d1758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A12-A13\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785008\",\n" +
            "                \"latitude\": \"34.764711\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"3ceaaf61758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B8-B9\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786437\",\n" +
            "                \"latitude\": \"34.765422\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"3e951a43758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A14-A15\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785206\",\n" +
            "                \"latitude\": \"34.765474\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"4e26e6b7758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A16-A17\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785448\",\n" +
            "                \"latitude\": \"34.765467\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"52a5fdc8758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B12-B13\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786212\",\n" +
            "                \"latitude\": \"34.764822\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"6bc5f3b2758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A18-A19\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785682\",\n" +
            "                \"latitude\": \"34.765474\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"74d173b4758a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B1\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783427\",\n" +
            "                \"latitude\": \"34.764674\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"7a7a5b00758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B14-B15\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785951\",\n" +
            "                \"latitude\": \"34.764829\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"7dcfc09a758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A20-A21\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785942\",\n" +
            "                \"latitude\": \"34.764726\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"87282706758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B16-B17\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785709\",\n" +
            "                \"latitude\": \"34.764770\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"91c92423758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A22-A23\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786167\",\n" +
            "                \"latitude\": \"34.764726\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"9fb0bfe9758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B18-B19\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785457\",\n" +
            "                \"latitude\": \"34.765430\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"a240254e758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A24-A25\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786419\",\n" +
            "                \"latitude\": \"34.764726\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"b4ed3c75758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B20-B21\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785233\",\n" +
            "                \"latitude\": \"34.765437\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"b54e3ce7758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A26-A27\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786670\",\n" +
            "                \"latitude\": \"34.764733\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c48a70be758a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A2A3\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783921\",\n" +
            "                \"latitude\": \"34.764718\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c683d365758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B22-B23\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784990\",\n" +
            "                \"latitude\": \"34.765422\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"cbd3a019758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A28-A29\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786904\",\n" +
            "                \"latitude\": \"34.764726\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"d4e7aa0a758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B24-B25\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784604\",\n" +
            "                \"latitude\": \"34.765400\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"d5940b58758a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A4-A5\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784164\",\n" +
            "                \"latitude\": \"34.764696\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e170ef54758b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A30-A31\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787110\",\n" +
            "                \"latitude\": \"34.765482\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e5bdf4fb758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B26-B27\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784344\",\n" +
            "                \"latitude\": \"34.765415\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"f3b6e75a758a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"A6-A7\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784370\",\n" +
            "                \"latitude\": \"34.765460\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"f3e9cf9c758c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"B28-B29\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784101\",\n" +
            "                \"latitude\": \"34.765408\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9d48649b757b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"乘车\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"firstFacilityName\": \"便民服务\",\n" +
            "        \"firstFacilityList\": [\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"0c4b9cec759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783391\",\n" +
            "                \"latitude\": \"34.764088\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"1242e1bf759811e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783319\",\n" +
            "                \"latitude\": \"34.766023\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"254df681759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784128\",\n" +
            "                \"latitude\": \"34.766001\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"3467454c759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784218\",\n" +
            "                \"latitude\": \"34.764088\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"4b374223759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787640\",\n" +
            "                \"latitude\": \"34.766097\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"5792b0e9759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787757\",\n" +
            "                \"latitude\": \"34.764155\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"a10ffe58759711e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787227\",\n" +
            "                \"latitude\": \"34.764696\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"bbf4129b759711e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"0\",\n" +
            "                \"latitude\": \"0\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"f6542940759811e6b7880242ac11000c\",\n" +
            "                \"name\": \"卫生间\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786850\",\n" +
            "                \"latitude\": \"34.766075\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"4eab0168759711e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"卫生间\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"09115ad6759711e6b7880242ac11000c\",\n" +
            "                \"name\": \"河南省农村信用社\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783526\",\n" +
            "                \"latitude\": \"34.764095\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9fd0177d759011e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"292a77a5759411e6b7880242ac11000c\",\n" +
            "                \"name\": \"广发银行\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786140\",\n" +
            "                \"latitude\": \"34.766023\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9fd0177d759011e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"963a641c759311e6b7880242ac11000c\",\n" +
            "                \"name\": \"郑州银行\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786595\",\n" +
            "                \"latitude\": \"34.764170\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9fd0177d759011e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"a4281b64759111e6b7880242ac11000c\",\n" +
            "                \"name\": \"华夏银行\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787344\",\n" +
            "                \"latitude\": \"34.764177\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9fd0177d759011e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"e1657f41759611e6b7880242ac11000c\",\n" +
            "                \"name\": \"中国工商银行\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783454\",\n" +
            "                \"latitude\": \"34.766053\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9fd0177d759011e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"银行\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"firstFacilityName\": \"生活服务\",\n" +
            "        \"firstFacilityList\": [\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"27d7139f759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"麦购便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783275\",\n" +
            "                \"latitude\": \"34.764370\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"57310180759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783912\",\n" +
            "                \"latitude\": \"34.764607\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"69f323da759b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"恒利便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786787\",\n" +
            "                \"latitude\": \"34.765096\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"776c0a44759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785233\",\n" +
            "                \"latitude\": \"34.764511\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"833876f4759b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"乐购便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786194\",\n" +
            "                \"latitude\": \"34.765104\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"8b5df9e2759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785942\",\n" +
            "                \"latitude\": \"34.765675\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"9e485160759b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"恒利便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784865\",\n" +
            "                \"latitude\": \"34.765074\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ac9102cd759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786311\",\n" +
            "                \"latitude\": \"34.764748\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"cecb89b3759c11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787407\",\n" +
            "                \"latitude\": \"34.764711\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"cfdb8056759b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786508\",\n" +
            "                \"latitude\": \"34.765111\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ff8ae10c759b11e6b7880242ac11000c\",\n" +
            "                \"name\": \"亨利便利店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783921\",\n" +
            "                \"latitude\": \"34.764600\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"1eb269f6759b11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"便利店\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"70b4099d759a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"佳润河南特产\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786239\",\n" +
            "                \"latitude\": \"34.764614\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9f2265f7759911e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"c64df12a759a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣特产店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.787245\",\n" +
            "                \"latitude\": \"34.765482\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9f2265f7759911e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"cfcbb598759911e6b7880242ac11000c\",\n" +
            "                \"name\": \"恒力特产店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.784146\",\n" +
            "                \"latitude\": \"34.765081\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"9f2265f7759911e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"edaae892759a11e6b7880242ac11000c\",\n" +
            "                \"name\": \"逸臣特产店\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.786329\",\n" +
            "                \"latitude\": \"34.765445\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"9f2265f7759911e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"特产\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"secondFacilityList\": [\n" +
            "              {\n" +
            "                \"id\": \"795eee7f759d11e6b7880242ac11000c\",\n" +
            "                \"name\": \"服务台\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.783595\",\n" +
            "                \"latitude\": \"34.765067\",\n" +
            "                \"floor\": 1,\n" +
            "                \"parentId\": \"fff0033e759c11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"b8f5a7fe759d11e6b7880242ac11000c\",\n" +
            "                \"name\": \"服务台\",\n" +
            "                \"level\": \"third\",\n" +
            "                \"longitude\": \"113.785601\",\n" +
            "                \"latitude\": \"34.765156\",\n" +
            "                \"floor\": 3,\n" +
            "                \"parentId\": \"fff0033e759c11e6b7880242ac11000c\",\n" +
            "                \"angle\": 0\n" +
            "              }\n" +
            "            ],\n" +
            "            \"secondFacilityName\": \"服务台\"\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";
}
