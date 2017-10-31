
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/WebKit/public/web/WebContextMenuData.h

package org.chromium.blink_public.web;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebContextMenuMediaType.MEDIA_TYPE_NONE, WebContextMenuMediaType.MEDIA_TYPE_IMAGE,
    WebContextMenuMediaType.MEDIA_TYPE_VIDEO, WebContextMenuMediaType.MEDIA_TYPE_AUDIO,
    WebContextMenuMediaType.MEDIA_TYPE_CANVAS, WebContextMenuMediaType.MEDIA_TYPE_FILE,
    WebContextMenuMediaType.MEDIA_TYPE_PLUGIN, WebContextMenuMediaType.MEDIA_TYPE_LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebContextMenuMediaType {
  /**
   * No special node is in context.
   */
  int MEDIA_TYPE_NONE = 0;
  /**
   * An image node is selected.
   */
  int MEDIA_TYPE_IMAGE = 1;
  /**
   * A video node is selected.
   */
  int MEDIA_TYPE_VIDEO = 2;
  /**
   * An audio node is selected.
   */
  int MEDIA_TYPE_AUDIO = 3;
  /**
   * A canvas node is selected.
   */
  int MEDIA_TYPE_CANVAS = 4;
  /**
   * A file node is selected.
   */
  int MEDIA_TYPE_FILE = 5;
  /**
   * A plugin node is selected.
   */
  int MEDIA_TYPE_PLUGIN = 6;
  int MEDIA_TYPE_LAST = 6;
}