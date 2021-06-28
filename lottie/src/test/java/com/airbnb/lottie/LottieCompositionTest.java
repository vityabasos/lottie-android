package com.airbnb.lottie;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LottieCompositionTest extends BaseTest {
  private static final String JSON = "{\"v\":\"4.11.1\",\"fr\":60,\"ip\":0,\"op\":180,\"w\":300,\"h\":300,\"nm\":\"Comp 1\",\"ddd\":0,\"assets\":[]," +
      "\"layers\":[{\"ddd\":0,\"ind\":1,\"ty\":4,\"nm\":\"Shape Layer 1\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0," +
      "\"k\":0,\"ix\":10},\"p\":{\"a\":0,\"k\":[150,150,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100]," +
      "\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"rc\",\"d\":1,\"s\":{\"a\":0,\"k\":[100,100],\"ix\":2},\"p\":{\"a\":0,\"k\":[0,0],\"ix\":3}," +
      "\"r\":{\"a\":0,\"k\":0,\"ix\":4},\"nm\":\"Rectangle Path 1\",\"mn\":\"ADBE Vector Shape - Rect\",\"hd\":false},{\"ty\":\"fl\"," +
      "\"c\":{\"a\":0,\"k\":[0.928262987324,0,0,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector " +
      "Graphic - Fill\",\"hd\":false}],\"ip\":0,\"op\":180,\"st\":0,\"bm\":0}]}";

  @Test
  public void testGetFrameForProgress() {
    LottieResult<LottieComposition> result = LottieCompositionFactory.fromJsonStringSync(JSON, null);
    //noinspection ConstantConditions
    assertEquals(66.59f, result.getValue().getFrameForProgress(0.37f), 0.01f);
  }

  @Test
  public void testGetProgressForFrame() {
    LottieResult<LottieComposition> result = LottieCompositionFactory.fromJsonStringSync(JSON, null);
    //noinspection ConstantConditions
    assertEquals(0.5f, result.getValue().getProgressForFrame(90), 0.01f);
  }
}
