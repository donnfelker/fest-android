// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.animation;

import android.animation.Animator;

/**
 * Assertions for {@link Animator} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAnimatorAssert}.
 */
public final class AnimatorAssert extends AbstractAnimatorAssert<AnimatorAssert, Animator> {
  public AnimatorAssert(Animator actual) {
    super(actual, AnimatorAssert.class);
  }
}
