package com.github.annotation.analytic.core.test;

import com.stanzaliving.analytics.logs.annotations.AnalysedEntity;
import org.junit.Ignore;


@AnalysedEntity
@Ignore
class DerivedClass extends BaseClass
{
    public String derivedClassString;
}
