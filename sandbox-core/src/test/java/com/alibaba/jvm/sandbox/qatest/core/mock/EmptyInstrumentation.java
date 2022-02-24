package com.alibaba.jvm.sandbox.qatest.core.mock;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;

public class EmptyInstrumentation implements Instrumentation {
    @Override
    public void addTransformer(ClassFileTransformer transformer, boolean canRetransform) {

    }

    @Override
    public void addTransformer(ClassFileTransformer transformer) {

    }

    @Override
    public boolean removeTransformer(ClassFileTransformer transformer) {
        return false;
    }

    @Override
    public boolean isRetransformClassesSupported() {
        return false;
    }

    @Override
    public void retransformClasses(Class<?>... classes) throws UnmodifiableClassException {

    }

    @Override
    public boolean isRedefineClassesSupported() {
        return false;
    }

    @Override
    public void redefineClasses(ClassDefinition... definitions) throws ClassNotFoundException, UnmodifiableClassException {

    }

    @Override
    public boolean isModifiableClass(Class<?> theClass) {
        return false;
    }

    @Override
    public Class[] getAllLoadedClasses() {
        return new Class[0];
    }

    @Override
    public Class[] getInitiatedClasses(ClassLoader loader) {
        return new Class[0];
    }

    @Override
    public long getObjectSize(Object objectToSize) {
        return 0;
    }

    @Override
    public void appendToBootstrapClassLoaderSearch(JarFile jarfile) {

    }

    @Override
    public void appendToSystemClassLoaderSearch(JarFile jarfile) {

    }

    @Override
    public boolean isNativeMethodPrefixSupported() {
        return false;
    }

    @Override
    public void setNativeMethodPrefix(ClassFileTransformer transformer, String prefix) {

    }

    /**
     * Redefine a module to expand the set of modules that it reads, the set of
     * packages that it exports or opens, or the services that it uses or
     * provides. This method facilitates the instrumentation of code in named
     * modules where that instrumentation requires changes to the set of modules
     * that are read, the packages that are exported or open, or the services
     * that are used or provided.
     *
     * <p> This method cannot reduce the set of modules that a module reads, nor
     * reduce the set of packages that it exports or opens, nor reduce the set
     * of services that it uses or provides. This method is a no-op when invoked
     * to redefine an unnamed module. </p>
     *
     * <p> When expanding the services that a module uses or provides then the
     * onus is on the agent to ensure that the service type will be accessible at
     * each instrumentation site where the service type is used. This method
     * does not check if the service type is a member of the module or in a
     * package exported to the module by another module that it reads. </p>
     *
     * <p> The {@code extraExports} parameter is the map of additional packages
     * to export. The {@code extraOpens} parameter is the map of additional
     * packages to open. In both cases, the map key is the fully-qualified name
     * of the package as defined in section 6.5.3 of
     * <cite>The Java Language Specification </cite>, for example, {@code
     * "java.lang"}. The map value is the non-empty set of modules that the
     * package should be exported or opened to. </p>
     *
     * <p> The {@code extraProvides} parameter is the additional service providers
     * for the module to provide. The map key is the service type. The map value
     * is the non-empty list of implementation types, each of which is a member
     * of the module and an implementation of the service. </p>
     *
     * <p> This method is safe for concurrent use and so allows multiple agents
     * to instrument and update the same module at around the same time. </p>
     *
     * @param module        the module to redefine
     * @param extraReads    the possibly-empty set of additional modules to read
     * @param extraExports  the possibly-empty map of additional packages to export
     * @param extraOpens    the possibly-empty map of additional packages to open
     * @param extraUses     the possibly-empty set of additional services to use
     * @param extraProvides the possibly-empty map of additional services to provide
     * @throws IllegalArgumentException    If {@code extraExports} or {@code extraOpens} contains a key
     *                                     that is not a package in the module; if {@code extraExports} or
     *                                     {@code extraOpens} maps a key to an empty set; if a value in the
     *                                     {@code extraProvides} map contains a service provider type that
     *                                     is not a member of the module or an implementation of the service;
     *                                     or {@code extraProvides} maps a key to an empty list
     * @throws UnmodifiableModuleException if the module cannot be modified
     * @throws NullPointerException        if any of the arguments are {@code null} or
     *                                     any of the Sets or Maps contains a {@code null} key or value
     * @see #isModifiableModule(Module)
     * @since 9
     */
    @Override
    public void redefineModule(Module module, Set<Module> extraReads, Map<String, Set<Module>> extraExports, Map<String, Set<Module>> extraOpens, Set<Class<?>> extraUses, Map<Class<?>, List<Class<?>>> extraProvides) {

    }

    /**
     * Tests whether a module can be modified with {@link #redefineModule
     * redefineModule}. If a module is modifiable then this method returns
     * {@code true}. If a module is not modifiable then this method returns
     * {@code false}. This method always returns {@code true} when the module
     * is an unnamed module (as redefining an unnamed module is a no-op).
     *
     * @param module the module to test if it can be modified
     * @return {@code true} if the module is modifiable, otherwise {@code false}
     * @throws NullPointerException if the module is {@code null}
     * @since 9
     */
    @Override
    public boolean isModifiableModule(Module module) {
        return false;
    }
}
