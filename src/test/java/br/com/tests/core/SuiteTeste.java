package br.com.tests.core;

import br.com.tests.tests.TestListUserGet;
import br.com.tests.tests.TestUserGet;
import br.com.tests.tests.TestUserPatch;
import br.com.tests.tests.TestUserPost;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestUserPost.class,
        TestListUserGet.class,
        TestUserPatch.class,
        TestUserGet.class
})
public class SuiteTeste{
}
