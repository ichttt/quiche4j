package io.quiche4j;

public class QuicheSocketAddress {
    private final long ptr;

    public QuicheSocketAddress(String ipAddress, int port) {
        this.ptr = Native.quiche_socket_address_new(ipAddress, port);
    }

    public long getPointer() {
        return ptr;
    }
}
